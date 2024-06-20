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
@Table(name="Gift_Certificate_Trans")

public class UnitGCPaymentTrans implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sCompnyCd")
    private String sCompnyCd;
    
    @Basic(optional = false)
    @Column(name = "dValidity")
    @Temporal(TemporalType.DATE)
    private Date dValidity;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "nAmountxx")
    private Number nAmountxx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
        
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "cCollectd")
    private String cCollectd;
    
    @Column(name = "cBilledxx")
    private String cBilledxx;
    
    @Basic(optional = true)
    @Column(name = "dBilledxx")
    @Temporal(TemporalType.DATE)
    private Date dBilledxx;
    
    @Column(name = "cPaidxxxx")
    private String cPaidxxxx;
    
    @Basic(optional = true)
    @Column(name = "dPaidxxxx")
    @Temporal(TemporalType.DATE)
    private Date dPaidxxxx;
    
    @Column(name = "cWaivexxx")
    private String cWaivexxx;
    
    @Basic(optional = true)
    @Column(name = "dWaivexxx")
    @Temporal(TemporalType.DATE)
    private Date dWaivexxx;
    
    @Column(name = "sWaivexxx")
    private String sWaivexxx;
        
    @Column(name = "cTranStat")
    private String cTranStat;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitGCPaymentTrans(){
        this.sTransNox = "";
        this.sCompnyCd = "";
        this.dValidity = null;
        this.sReferNox = "";
        this.nAmountxx = 0.00;
        this.nAmtPaidx = 0.00;
        this.sRemarksx = "";
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.cCollectd = "0";
        this.cBilledxx = "0";
        this.dBilledxx = null;
        this.cPaidxxxx = "0";
        this.dPaidxxxx = null;
        this.cWaivexxx = "0";
        this.dWaivexxx = null;
        this.sWaivexxx = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sCompnyCd");
        laColumns.add("dValidity");
        laColumns.add("sReferNox");
        laColumns.add("nAmountxx");
        laColumns.add("nAmtPaidx");
        laColumns.add("sRemarksx");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("cCollectd");
        laColumns.add("cBilledxx");
        laColumns.add("dBilledxx");
        laColumns.add("cPaidxxxx");
        laColumns.add("dPaidxxxx");
        laColumns.add("cWaivexxx");
        laColumns.add("dWaivexxx");
        laColumns.add("sWaivexxx");
        laColumns.add("cTranStat");
        laColumns.add("dModified");

    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setCompnyCd(String sCompnyCd){
        this.sCompnyCd = sCompnyCd;
    }
    public String getCompnyCd(){
        return sCompnyCd;
    }
    
    public void setValidity(Date dValidity){
        this.dValidity = dValidity;
    }
    public Date getValidity(){
        return dValidity;
    }
    
    public void setReferNox(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNox(){
        return sReferNox;
    }
    
    public void setAmountxx(Number nAmountxx){
        this.nAmountxx = nAmountxx;
    }
    public Number getAmountxx(){
        return nAmountxx;
    }
    
    public void setAmtPaidx(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmtPaidx(){
        return nAmtPaidx;
    }
    
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarksx(){
        return sRemarksx;
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
    
    public void setCollectd(String cCollectd){
        this.cCollectd = cCollectd;
    }
    public String getCollectd(){
        return cCollectd;
    }
    
    public void setBilledxx(String cBilledxx){
        this.cBilledxx = cBilledxx;
    }
    public String getBilledxx(){
        return cBilledxx;
    }
    
    public void setBilledxx(Date dBilledxx){
        this.dBilledxx = dBilledxx;
    }
    public Date setBilledDt(){
        return dBilledxx;
    }
    
    public void setPaidxxxx(String cPaidxxxx){
        this.cPaidxxxx = cPaidxxxx;
    }
    public String getPaidxxxx(){
        return cPaidxxxx;
    }
    
    public void setPaidxxxx(Date dPaidxxxx){
        this.dPaidxxxx = dPaidxxxx;
    }
    public Date getPaidDate(){
        return dPaidxxxx;
    }
    
    public void setWaivexxx(String cWaivexxx){
        this.cWaivexxx = cWaivexxx;
    }
    public String getWaivexxx(){
        return cWaivexxx;
    }
    
    public void setWaivexxx(Date dWaivexxx){
        this.dWaivexxx = dWaivexxx;
    }
    public Date getWaiveDte(){
        return dWaivexxx;
    }
    
    public void setWaiveUsr(String sWaivexxx){
        this.sWaivexxx = sWaivexxx;
    }
    public String getWaiveUsr(){
        return sWaivexxx;
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
        if (!(object instanceof UnitGCPaymentTrans)) {
            return false;
        }
        UnitGCPaymentTrans other = (UnitGCPaymentTrans) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitGCPaymentTrans[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sCompnyCd;
            case 3: return dValidity;
            case 4: return sReferNox;
            case 5: return nAmountxx;
            case 6: return nAmtPaidx;
            case 7: return sRemarksx;
            case 8: return sSourceCd;
            case 9: return sSourceNo;
            case 10: return cCollectd;
            case 11: return cBilledxx;
            case 12: return dBilledxx;
            case 13: return cPaidxxxx;
            case 14: return dPaidxxxx;
            case 15: return cWaivexxx;
            case 16: return dWaivexxx;
            case 17: return sWaivexxx;
            case 18: return cTranStat;
            case 19: return dModified;
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
        return "Gift_Certificate_Trans";
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
            case 2: sCompnyCd = (String) foValue; break;
            case 3: dValidity = (Date) foValue; break;
            case 4: sReferNox = (String) foValue; break;
            case 5: nAmountxx = (Number) foValue; break;
            case 6: nAmtPaidx = (Number) foValue; break;
            case 7: sRemarksx = (String) foValue; break;
            case 8: sSourceCd = (String) foValue; break;
            case 9: sSourceNo = (String) foValue; break;
            case 10: cCollectd = (String) foValue; break;
            case 11: cBilledxx = (String) foValue; break;
            case 12: dBilledxx = (Date) foValue; break;
            case 13: cPaidxxxx = (String) foValue; break;
            case 14: dPaidxxxx = (Date) foValue; break;
            case 15: cWaivexxx = (String) foValue; break;
            case 16: dWaivexxx = (Date) foValue; break;
            case 17: sWaivexxx = (String) foValue; break;
            case 18: cTranStat = (String) foValue; break;
            case 19: dModified = (Date) foValue; break;
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