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
@Table(name="Cash_Pull_Out")

public class UnitCashPullOut implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
        
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Basic(optional = true)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "cPaymForm")
    private String cPaymForm;
    
    @Column(name = "nAmountxx")
    private Number nAmountxx;
    
    @Column(name = "sCashierx")
    private String sCashierx;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCashPullOut(){
        sTransNox = "";
        sBranchCd = "";
        cPaymForm = "";
        nAmountxx = 0.00;
        sCashierx = "";
        sReferNox = "";
        sRemarksx = "";
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("cPaymForm");
        laColumns.add("nAmountxx");
        laColumns.add("sCashierx");
        laColumns.add("sReferNox");
        laColumns.add("sRemarksx");
        laColumns.add("dModified");
    }
    
    public void setTransactionNo(String fsValue){
        sTransNox = fsValue;
    }
    public String getTransactionNo(){
        return sTransNox;
    }
    
    public void setBranchCode(String fsValue){
        sBranchCd = fsValue;
    }
    public String getBranchCode(){
        return sBranchCd;
    }
    
    public void setTransactionDate(Date dModified){
        dTransact = dModified;
    }
    public Date getTransactionDate(){
        return dTransact;
    }
    
    public void setPaymentForm(String fsValue){
        cPaymForm = fsValue;
    }
    public String getPaymentForm(){
        return cPaymForm;
    }
    
    public void setAmount(Number fnValue){
        nAmountxx = fnValue;
    }
    public Number getAmount(){
        return nAmountxx;
    }
    
    public void setCashier(String fsValue){
        sCashierx = fsValue;
    }
    public String getCashier(){
        return sCashierx;
    }
    
    public void setReference(String fsValue){
        sReferNox = fsValue;
    }
    public String getReference(){
        return sReferNox;
    }
    
    public void setRemarks(String fsValue){
        sRemarksx = fsValue;
    }
    public String getRemarks(){
        return sRemarksx;
    }
        
    public void setDateModified(Date fdValue){
        dModified = fdValue;
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
        if (!(object instanceof UnitCashPullOut)) {
            return false;
        }
        UnitCashPullOut other = (UnitCashPullOut) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return cPaymForm;
            case 5: return nAmountxx;
            case 6: return sCashierx;
            case 7: return sReferNox;
            case 8: return sRemarksx;
            case 9: return dModified;
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
        return "Cash_Pull_Out";
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
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: cPaymForm = (String) foValue; break;
            case 5: nAmountxx = (Number) foValue; break;
            case 6: sCashierx = (String) foValue; break;
            case 7: sReferNox = (String) foValue; break;
            case 8: sRemarksx = (String) foValue; break;
            case 9: dModified = (Date) foValue; break;
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