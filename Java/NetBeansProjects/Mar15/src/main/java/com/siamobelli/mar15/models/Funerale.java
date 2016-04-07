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
package com.siamobelli.mar15.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author svilupposw
 */
@Entity
@Table(name = "funerale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funerale.findAll", query = "SELECT f FROM Funerale f"),
    @NamedQuery(name = "Funerale.findById", query = "SELECT f FROM Funerale f WHERE f.id = :id"),
    @NamedQuery(name = "Funerale.findByDataFunerale", query = "SELECT f FROM Funerale f WHERE f.dataFunerale = :dataFunerale")})
public class Funerale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_funerale")
    @Temporal(TemporalType.DATE)
    private Date dataFunerale;
    @JoinColumn(name = "id_lapide", referencedColumnName = "id")
    @ManyToOne
    private Lapide idLapide;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;

    public Funerale() {
    }

    public Funerale(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataFunerale() {
        return dataFunerale;
    }

    public void setDataFunerale(Date dataFunerale) {
        this.dataFunerale = dataFunerale;
    }

    public Lapide getIdLapide() {
        return idLapide;
    }

    public void setIdLapide(Lapide idLapide) {
        this.idLapide = idLapide;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        if (!(object instanceof Funerale)) {
            return false;
        }
        Funerale other = (Funerale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siamobelli.mar15.models.Funerale[ id=" + id + " ]";
    }
    
}
