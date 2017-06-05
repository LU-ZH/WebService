
package com.jk.ws.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jk.ws.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateUserById_QNAME = new QName("http://user.ws.jk.com/", "updateUserById");
    private final static QName _SelectUserListResponse_QNAME = new QName("http://user.ws.jk.com/", "selectUserListResponse");
    private final static QName _AddUser_QNAME = new QName("http://user.ws.jk.com/", "addUser");
    private final static QName _DeleteUserByIdResponse_QNAME = new QName("http://user.ws.jk.com/", "deleteUserByIdResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://user.ws.jk.com/", "addUserResponse");
    private final static QName _UpdateUserByIdResponse_QNAME = new QName("http://user.ws.jk.com/", "updateUserByIdResponse");
    private final static QName _DeleteUserById_QNAME = new QName("http://user.ws.jk.com/", "deleteUserById");
    private final static QName _SelectUserList_QNAME = new QName("http://user.ws.jk.com/", "selectUserList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jk.ws.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectUserListResponse }
     * 
     */
    public SelectUserListResponse createSelectUserListResponse() {
        return new SelectUserListResponse();
    }

    /**
     * Create an instance of {@link UpdateUserById }
     * 
     */
    public UpdateUserById createUpdateUserById() {
        return new UpdateUserById();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link DeleteUserByIdResponse }
     * 
     */
    public DeleteUserByIdResponse createDeleteUserByIdResponse() {
        return new DeleteUserByIdResponse();
    }

    /**
     * Create an instance of {@link SelectUserList }
     * 
     */
    public SelectUserList createSelectUserList() {
        return new SelectUserList();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserByIdResponse }
     * 
     */
    public UpdateUserByIdResponse createUpdateUserByIdResponse() {
        return new UpdateUserByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteUserById }
     * 
     */
    public DeleteUserById createDeleteUserById() {
        return new DeleteUserById();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "updateUserById")
    public JAXBElement<UpdateUserById> createUpdateUserById(UpdateUserById value) {
        return new JAXBElement<UpdateUserById>(_UpdateUserById_QNAME, UpdateUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "selectUserListResponse")
    public JAXBElement<SelectUserListResponse> createSelectUserListResponse(SelectUserListResponse value) {
        return new JAXBElement<SelectUserListResponse>(_SelectUserListResponse_QNAME, SelectUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "deleteUserByIdResponse")
    public JAXBElement<DeleteUserByIdResponse> createDeleteUserByIdResponse(DeleteUserByIdResponse value) {
        return new JAXBElement<DeleteUserByIdResponse>(_DeleteUserByIdResponse_QNAME, DeleteUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "updateUserByIdResponse")
    public JAXBElement<UpdateUserByIdResponse> createUpdateUserByIdResponse(UpdateUserByIdResponse value) {
        return new JAXBElement<UpdateUserByIdResponse>(_UpdateUserByIdResponse_QNAME, UpdateUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "deleteUserById")
    public JAXBElement<DeleteUserById> createDeleteUserById(DeleteUserById value) {
        return new JAXBElement<DeleteUserById>(_DeleteUserById_QNAME, DeleteUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.ws.jk.com/", name = "selectUserList")
    public JAXBElement<SelectUserList> createSelectUserList(SelectUserList value) {
        return new JAXBElement<SelectUserList>(_SelectUserList_QNAME, SelectUserList.class, null, value);
    }

}
