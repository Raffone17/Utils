/*
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author svilupposw
 */
@Entity
@Table(name = "lapide")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lapide.findAll", query = "SELECT l FROM Lapide l"),
    @NamedQuery(name = "Lapide.findById", query = "SELECT l FROM Lapide l WHERE l.id = :id"),
    @NamedQuery(name = "Lapide.findByNome", query = "SELECT l FROM Lapide l WHERE l.nome = :nome"),
    @NamedQuery(name = "Lapide.findByCognome", query = "SELECT l FROM Lapide l WHERE l.cognome = :cognome"),
    @NamedQuery(name = "Lapide.findByDataNascita", query = "SELECT l FROM Lapide l WHERE l.dataNascita = :dataNascita"),
    @NamedQuery(name = "Lapide.findByDataMorte", query = "SELECT l FROM Lapide l WHERE l.dataMorte = :dataMorte"),
    @NamedQuery(name = "Lapide.findByEpitaffio", query = "SELECT l FROM Lapide l WHERE l.epitaffio = :epitaffio")})
public class Lapide implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "data_nascita")
    @Temporal(TemporalType.DATE)
    private Date dataNascita;
    @Column(name = "data_morte")
    @Temporal(TemporalType.DATE)
    private Date dataMorte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "epitaffio")
    private String epitaffio;

    public Lapide() {
    }

    public Lapide(Integer id) {
        this.id = id;
    }

    public Lapide(Integer id, String nome, String cognome, String epitaffio) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.epitaffio = epitaffio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public String getEpitaffio() {
        return epitaffio;
    }

    public void setEpitaffio(String epitaffio) {
        this.epitaffio = epitaffio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lapide)) {
            return false;
        }
        Lapide other = (Lapide) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Lapide[ id=" + id + " ]";
    }
    
}
