/**
 * @author  Michael Cuison
 * 
 * @since August 21, 2018
 */
package org.rmj.payment.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Sales_Payment")

public class UnitSalesPayment implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "cPaymForm")
    private String cPaymForm;
    
    @Column(name = "nAmountxx")
    private Number nAmountxx;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSalesPayment(){
        this.sTransNox = "";
        this.cPaymForm = "";
        this.nAmountxx = 0.00;
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("cPaymForm");
        laColumns.add("nAmountxx");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setPaymForm(String cPaymForm){
        this.cPaymForm = cPaymForm;
    }
    public String getPaymForm(){
        return cPaymForm;
    }
    
    public void setAmountxx(Number nAmountxx){
        this.nAmountxx = nAmountxx;
    }
    public Number getAmountxx(){
        return nAmountxx;
    }
    
    public void setSourceCd(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    public String getSourceCd(){
        return sSourceCd;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
        
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitSalesPayment)) {
            return false;
        }
        UnitSalesPayment other = (UnitSalesPayment) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitSalesPayment[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return cPaymForm;
            case 3: return nAmountxx;
            case 4: return sSourceCd;
            case 5: return sSourceNo;
            case 6: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Sales_Payment";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: cPaymForm = (String) foValue; break;
            case 3: nAmountxx = (Number) foValue; break;
            case 4: sSourceCd = (String) foValue; break;
            case 5: sSourceNo = (String) foValue; break;
            case 6: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
