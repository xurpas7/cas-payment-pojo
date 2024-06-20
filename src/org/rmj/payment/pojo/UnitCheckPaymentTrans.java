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
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Check_Payment_Trans")

public class UnitCheckPaymentTrans implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Basic(optional = true)
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "sBankCode")
    private String sBankCode;
    
    @Column(name = "sCheckNox")
    private String sCheckNox;
    
    @Basic(optional = false)
    @Column(name = "dCheckDte")
    @Temporal(TemporalType.DATE)
    private Date dCheckDte;
    
    @Column(name = "nAmountxx")
    private Number nAmountxx;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;   
    
    @Column(name = "nClearDay")
    private int nClearDay;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
        
    @Column(name = "cTranStat")
    private String cTranStat;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCheckPaymentTrans(){
        this.sTransNox = "";
        this.dTransact = null;
        this.sBankCode = "";
        this.sCheckNox = "";
        this.dCheckDte = null;
        this.nAmountxx = 0.00;
        this.nClearDay = 0;
        this.sRemarksx = "";
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("dTransact");
        laColumns.add("sBankCode");
        laColumns.add("sCheckNox");
        laColumns.add("dCheckDte");
        laColumns.add("nAmountxx");
        laColumns.add("sRemarksx");
        laColumns.add("nClearDay");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("cTranStat");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
    }
    
    public void setBankCode(String sBankCode){
        this.sBankCode = sBankCode;
    }
    public String getBankCode(){
        return sBankCode;
    }
    
    public void setCheckNox(String sCheckNox){
        this.sCheckNox = sCheckNox;
    }
    public String getCheckNox(){
        return sCheckNox;
    }
    
    public void setCheckDte(Date dCheckDte){
        this.dCheckDte = dCheckDte;
    }
    public Date getCheckDte(){
        return dCheckDte;
    }
    
    public void setAmountxx(Number nAmountxx){
        this.nAmountxx = nAmountxx;
    }
    public Number getAmountxx(){
        return nAmountxx;
    }
    
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarksx(){
        return sRemarksx;
    }
    
    public void setClearDay(int nClearDay){
        this.nClearDay = nClearDay;
    }
    public int getClearDay(){
        return nClearDay;
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
        
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
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
        if (!(object instanceof UnitCheckPaymentTrans)) {
            return false;
        }
        UnitCheckPaymentTrans other = (UnitCheckPaymentTrans) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitCheckPaymentTrans[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return dTransact;
            case 3: return sBankCode;
            case 4: return sCheckNox;
            case 5: return dCheckDte;
            case 6: return nAmountxx;
            case 7: return sRemarksx;
            case 8: return nClearDay;
            case 9: return sSourceCd;
            case 10: return sSourceNo;
            case 11: return cTranStat;
            case 12: return dModified;
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
        return "Check_Payment_Trans";
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
            case 2: dTransact = (Date) foValue; break;
            case 3: sBankCode = (String) foValue; break;
            case 4: sCheckNox = (String) foValue; break;
            case 5: dCheckDte = (Date) foValue; break;
            case 6: nAmountxx = (Number) foValue; break;
            case 7: sRemarksx = (String) foValue; break;
            case 8: nClearDay = (int) foValue; break;
            case 9: sSourceCd = (String) foValue; break;
            case 10: sSourceNo = (String) foValue; break;
            case 11: cTranStat = (String) foValue; break;
            case 12: dModified = (Date) foValue; break;
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