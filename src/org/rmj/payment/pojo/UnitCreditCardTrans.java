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
@Table(name="Credit_Card_Trans")

public class UnitCreditCardTrans implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "sTermnlID")
    private String sTermnlID;
    
    @Column(name = "sBankCode")
    private String sBankCode;
    
    @Column(name = "sCardIDxx")
    private String sCardIDxx;
    
    @Column(name = "sCardNoxx")
    private String sCardNoxx;
    
    @Column(name = "sApprovNo")
    private String sApprovNo;   
    
    @Column(name = "sBatchNox")
    private String sBatchNox;   
    
    @Column(name = "nAmountxx")
    private Number nAmountxx;
    
    @Column(name = "sTermCode")
    private String sTermCode;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "sCollectd")
    private String sCollectd;
        
    @Basic(optional = true)
    @Column(name = "dCollectd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dCollectd;
    
    @Column(name = "nBankChrg")
    private Number nBankChrg;
    
    @Column(name = "nTaxAmtxx")
    private Number nTaxAmtxx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "cTranStat")
    private String cTranStat;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCreditCardTrans(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.sTermnlID = "";
        this.sBankCode = "";
        this.sCardIDxx = "";
        this.sCardNoxx = "";
        this.sApprovNo = "";
        this.sBatchNox = "";
        this.nAmountxx = 0.00;
        this.sTermCode = "";
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.sCollectd = "";
        this.dCollectd = null;
        this.nBankChrg = 0.00;
        this.nTaxAmtxx = 0.00;
        this.nAmtPaidx = 0.00;
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("sTermnlID");
        laColumns.add("sBankCode");
        laColumns.add("sCardIDxx");
        laColumns.add("sCardNoxx");
        laColumns.add("sApprovNo");
        laColumns.add("sBatchNox");
        laColumns.add("nAmountxx");
        laColumns.add("sTermCode");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("sCollectd");
        laColumns.add("dCollectd");
        laColumns.add("nBankChrg");
        laColumns.add("nTaxAmtxx");
        laColumns.add("nAmtPaidx");
        laColumns.add("cTranStat");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setTermnlID(String sTermnlID){
        this.sTermnlID = sTermnlID;
    }
    public String getTermnlID(){
        return sTermnlID;
    }
    
    public void setBankCode(String sBankCode){
        this.sBankCode = sBankCode;
    }
    public String getBankCode(){
        return sBankCode;
    }
    
    public void setCardIDxx(String sCardIDxx){
        this.sCardIDxx = sCardIDxx;
    }
    public String getCardIDxx(){
        return sCardIDxx;
    }
    
    public void setCardNoxx(String sCardNoxx){
        this.sCardNoxx = sCardNoxx;
    }
    public String getCardNoxx(){
        return sCardNoxx;
    }
    
    public void setApprovNo(String sApprovNo){
        this.sApprovNo = sApprovNo;
    }
    public String getApprovNo(){
        return sApprovNo;
    }
    
    public void setBatchNox(String sBatchNox){
        this.sBatchNox = sBatchNox;
    }
    public String getBatchNox(){
        return sBatchNox;
    }
    
    public void setAmountxx(Number nAmountxx){
        this.nAmountxx = nAmountxx;
    }
    public Number getAmountxx(){
        return nAmountxx;
    }
    
    public void setTermCode(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTermCode(){
        return sTermCode;
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
    
    public void setCollectd(String sCollectd){
        this.sCollectd = sCollectd;
    }
    public String getCollectd(){
        return sCollectd;
    }
    
    public void setCollectdDte(Date dCollectd){
        this.dCollectd = dCollectd;
    }
    public Date getCollectdDte(){
        return dCollectd;
    }
    
    public void setBankChrg(Number nBankChrg){
        this.nBankChrg = nBankChrg;
    }
    public Number getBankChrg(){
        return nBankChrg;
    }
    
    public void setTaxAmtxx(Number nTaxAmtxx){
        this.nTaxAmtxx = nTaxAmtxx;
    }
    public Number getTaxAmtxx(){
        return nTaxAmtxx;
    }
    
    public void setAmtPaidx(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmtPaidx(){
        return nAmtPaidx;
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
        if (!(object instanceof UnitCreditCardTrans)) {
            return false;
        }
        UnitCreditCardTrans other = (UnitCreditCardTrans) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitCreditCardTrans[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return sTermnlID;
            case 4: return sBankCode;
            case 5: return sCardIDxx;
            case 6: return sCardNoxx;
            case 7: return sApprovNo;
            case 8: return sBatchNox;
            case 9: return nAmountxx;
            case 10: return sTermCode;
            case 11: return sSourceCd;
            case 12: return sSourceNo;
            case 13: return sCollectd;
            case 14: return dCollectd;
            case 15: return nBankChrg;
            case 16: return nTaxAmtxx;
            case 17: return nAmtPaidx;
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
        return "Credit_Card_Trans";
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
            case 3: sTermnlID = (String) foValue; break;
            case 4: sBankCode = (String) foValue; break;
            case 5: sCardIDxx = (String) foValue; break;
            case 6: sCardNoxx = (String) foValue; break;
            case 7: sApprovNo = (String) foValue; break;
            case 8: sBatchNox = (String) foValue; break;
            case 9: nAmountxx = (Number) foValue; break;
            case 10: sTermCode = (String) foValue; break;
            case 11: sSourceCd = (String) foValue; break;
            case 12: sSourceNo = (String) foValue; break;
            case 13: sCollectd = (String) foValue; break;
            case 14: dCollectd = (Date) foValue; break;
            case 15: nBankChrg = (Number) foValue; break;
            case 16: nTaxAmtxx = (Number) foValue; break;
            case 17: nAmtPaidx = (Number) foValue; break;
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