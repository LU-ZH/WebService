package com.jk.ws;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * Created by lenovo on 2017/6/5.
 */
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private String userId;
    private String userPass;

    public AuthInterceptor(String userId,String userPass){
        super(Phase.PREPARE_SEND);//在准备发送SOAP消息时启用该拦截器
        this.userId=userId;
        this.userPass=userPass;
    }
    public void handleMessage(SoapMessage msg) throws Fault {
        List<Header> headers=msg.getHeaders();
        //创建Document对象
        Document doc= DOMUtils.createDocument();
        Element ele=doc.createElement("authHeader");

        //此处创建的元素应该按照服务器那边的要求
        Element idEle=doc.createElement("userId");
        idEle.setTextContent(userId);
        Element passEle=doc.createElement("userPass");
        passEle.setTextContent(userPass);

        ele.appendChild(idEle);
        ele.appendChild(passEle);

        /**
         * 上面代码生成了一个如下XML文档片段
         * <authHeader>
         *      <userId>hejingyuan</userId>
         *      <userPass>hjy</userPass>
         * </authHeader>
         */
        //把ele元素包装成Header，并添加到SOAP消息的Header列表中
        headers.add(new Header(new QName("dsgsdxbgfsdzxhgsdf"),ele));
    }
}
