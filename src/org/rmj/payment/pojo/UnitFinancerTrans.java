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
@Table(name="Other_Payment_Trans")

public class UnitFinancerTrans implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sClientID")
    private String sClientID;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "nTotlAmnt")
    private Number nFinAmtxx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "sTermCode")
    private String sTermCode;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
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
    
    public UnitFinancerTrans(){
        this.sTransNox = "";
        this.sClientID = "";
        this.sReferNox = "";
        this.nFinAmtxx = 0.00;
        this.nAmtPaidx = 0.00;
        this.sTermCode = "";
        this.sRemarksx = "";
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sClientID");
        laColumns.add("sReferNox");
        laColumns.add("nFinAmtxx");
        laColumns.add("nAmtPaidx");
        laColumns.add("sTermCode");
        laColumns.add("sRemarksx");
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
    
    public void setFinancer(String sClientID){
        this.sClientID = sClientID;
    }
    public String getFinancer(){
        return sClientID;
    }
    
    public void setReferNox(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNox(){
        return sReferNox;
    }
    
    public void setFinAmtxx(Number nFinAmtxx){
        this.nFinAmtxx = nFinAmtxx;
    }
    public Number getFinAmtxx(){
        return nFinAmtxx;
    }
    
    public void setAmtPaidx(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmtPaidx(){
        return nAmtPaidx;
    }
    
    public void setTermIDxx(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTermIDxx(){
        return sTermCode;
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
        if (!(object instanceof UnitFinancerTrans)) {
            return false;
        }
        UnitFinancerTrans other = (UnitFinancerTrans) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitFinancerTrans[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sClientID;
            case 3: return sReferNox;
            case 4: return nFinAmtxx;
            case 5: return nAmtPaidx;
            case 6: return sTermCode;
            case 7: return sRemarksx;
            case 8: return sSourceCd;
            case 9: return sSourceNo;
            case 10: return cTranStat;
            case 11: return dModified;
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
        return "Financer_Trans";
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
            case 2: sClientID = (String) foValue; break;
            case 3: sReferNox = (String) foValue; break;
            case 4: nFinAmtxx = (Number) foValue; break;
            case 5: nAmtPaidx = (Number) foValue; break;
            case 6: sTermCode = (String) foValue; break;
            case 7: sRemarksx = (String) foValue; break;
            case 8: sSourceCd = (String) foValue; break;
            case 9: sSourceNo = (String) foValue; break;
            case 10: cTranStat = (String) foValue; break;
            case 11: dModified = (Date) foValue; break;
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