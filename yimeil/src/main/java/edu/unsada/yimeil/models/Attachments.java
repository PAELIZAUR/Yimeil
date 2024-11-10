package edu.unsada.yimeil.models;

import javax.persistence.*;


@Entity
public class Attachments {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idattachments")

    private int idattachments;

    @Basic
    @Column(name = "filename")

    private String filename;

    @Basic
    @Column(name = "url")

    private String url;

    @Basic
    @Column(name = "correo_emailId")

    private int correoEmailId;
    @ManyToOne
    @JoinColumn(name = "correo_emailId", referencedColumnName = "emailId", nullable = false)
    private Correo correoByCorreoEmailId;

    public int getIdattachments() {
        return idattachments;
    }

    public void setIdattachments(int idattachments) {
        this.idattachments = idattachments;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        Attachments that = (Attachments) o;

        if (idattachments != that.idattachments) return false;
        if (correoEmailId != that.correoEmailId) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idattachments;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
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
