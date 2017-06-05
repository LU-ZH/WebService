package com.jk.ws;

import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.WSSecurityException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/5/26.
 */
public class WSAuthImpl implements CallbackHandler {

    private Map<String, String> passwords = new HashMap<String, String>();

    public WSAuthImpl() {
        passwords.put("admin", "password");
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
            String identifier = pc.getIdentifer();
            int usage = pc.getUsage();
            if (usage == WSPasswordCallback.USERNAME_TOKEN) {// 密钥方式USERNAME_TOKEN
                if (!passwords.containsKey(identifier)) {
                    try {
                        throw new WSSecurityException("User not match - "+identifier);
                    } catch (WSSecurityException e) {
                        e.printStackTrace();
                    }
                }
                // username token pwd...
                // ▲这里的值必须和客户端设的值相同,从cxf2.4.x后校验方式改为cxf内部实现校验，不必自己比较password是否相同
                // 请参考：http://cxf.apache.org/docs/24-migration-guide.html的Runtime
                // Changes片段
                pc.setPassword(passwords.get(identifier));// ▲【这里非常重要】▲
                // ▲PS 如果和客户端不同将抛出org.apache.ws.security.WSSecurityException:
                // The
                // security token could not be authenticated or
                // authorized异常，服务端会认为客户端为非法调用
            }else if (usage == WSPasswordCallback.SIGNATURE) {// 密钥方式SIGNATURE
                if (!passwords.containsKey(identifier)) {
                    try {
                        throw new WSSecurityException("User not match - "+identifier);
                    } catch (WSSecurityException e) {
                        e.printStackTrace();
                    }
                }
                // set the password for client's keystore.keyPassword
                // ▲这里的值必须和客户端设的值相同,从cxf2.4.x后校验方式改为cxf内部实现校验，不必自己比较password是否相同;
                // 请参考：http://cxf.apache.org/docs/24-migration-guide.html的Runtime
                // Changes片段
                pc.setPassword(passwords.get(identifier));// //▲【这里非常重要】▲
                // ▲PS:如果和客户端不同将抛出org.apache.ws.security.WSSecurityException:The
                // security token could not be authenticated or
                // authorized异常，服务端会认为客户端为非法调用
            }
        }
    }

//    @Override
//    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
//        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
//        String pw = pc.getPassword();
//        String idf = pc.getIdentifer();
//        //特别注意的是 这里的pw肯是null, 无论你password是否传值。cxf 2.4之后，
//        //密码的比较是框架自动帮我们完成，因此不需要我们获取传递过来的密码，如果你
//        //一定要查看密码的话,可以通过new String(pc.getKey())获取。在该回调函数中
//        //我们只需要使用 idf 从数据库中查询出密码，使用pc.setPassword()方法将密码设
//        //置进去,框架获取的的密码后会进行比较，并通过抛出异常的方式提示验证出错。
//        System.out.println("密码是: " + pw);
//        System.out.println("身份是: " + idf);
//        //根据idf 我们从数据中查询出的密码 假如是 "abc"
//        pc.setPassword("123456");
//    }
}
