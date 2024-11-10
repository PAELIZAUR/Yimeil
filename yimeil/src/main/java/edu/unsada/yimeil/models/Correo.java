package edu.unsada.yimeil.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;


@Entity

public class Correo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emailId")

    private int emailId;

    @Basic
    @Column(name = "subject")

    private String subject;

    @Basic
    @Column(name = "body")

    private String body;

    @Basic
    @Column(name = "receivedAt")
    private Timestamp receivedAt;
    @ManyToOne
    @OneToMany(mappedBy = "correoByCorreoEmailId")
    @jakarta.persistence.JoinColumn(name = "emailId", referencedColumnName = "correo_emailId", nullable = false)
    private Collection<Attachments> attachmentsByEmailId;
    @OneToMany(mappedBy = "correoByCorreoEmailId")
    private Collection<DestinatariosFrom> destinatariosFromsByEmailId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userId")
    private String userId;


    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Timestamp receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Collection<Attachments> getAttachmentsByEmailId() {
        return attachmentsByEmailId;
    }

    public void setAttachmentsByEmailId(Collection<Attachments> attachmentsByEmailId) {
        this.attachmentsByEmailId = attachmentsByEmailId;
    }

    public Collection<DestinatariosFrom> getDestinatariosFromsByEmailId() {
        return destinatariosFromsByEmailId;
    }

    public void setDestinatariosFromsByEmailId(Collection<DestinatariosFrom> destinatariosFromsByEmailId) {
        this.destinatariosFromsByEmailId = destinatariosFromsByEmailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
