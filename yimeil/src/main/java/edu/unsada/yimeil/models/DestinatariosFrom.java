package edu.unsada.yimeil.models;

import javax.persistence.*;

@Entity
@Table(name = "destinatarios_from", schema = "yimeil", catalog = "")
public class DestinatariosFrom {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfrom")
    private int idfrom;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "correo_emailId")
    private int correoEmailId;
    @ManyToOne
    @JoinColumn(name = "correo_emailId", referencedColumnName = "emailId", nullable = false)
    private Correo correoByCorreoEmailId;

    public int getIdfrom() {
        return idfrom;
    }

    public void setIdfrom(int idfrom) {
        this.idfrom = idfrom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCorreoEmailId() {
        return correoEmailId;
    }

    public void setCorreoEmailId(int correoEmailId) {
        this.correoEmailId = correoEmailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DestinatariosFrom that = (DestinatariosFrom) o;

        if (idfrom != that.idfrom) return false;
        if (correoEmailId != that.correoEmailId) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfrom;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + correoEmailId;
        return result;
    }

    public Correo getCorreoByCorreoEmailId() {
        return correoByCorreoEmailId;
    }

    public void setCorreoByCorreoEmailId(Correo correoByCorreoEmailId) {
        this.correoByCorreoEmailId = correoByCorreoEmailId;
    }
}
