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
@Table(name="Cash_Drawer")

public class UnitCashDrawer implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sTranDate")
    private String sTranDate;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "nOpenAmtx")
    private Number nOpenAmtx;
    
    @Column(name = "nCashAmtx")
    private Number nCashAmtx;
    
    @Column(name = "nCheckAmt")
    private Number nCheckAmt;
    
    @Column(name = "nChargexx")
    private Number nChargexx;
    
    @Column(name = "nCredtCrd")
    private Number nCredtCrd;
    
    @Column(name = "nGiftCert")
    private Number nGiftCert;
    
    @Column(name = "nFinAmntx")
    private Number nFinAmntx;
    
    @Column(name = "nWithdraw")
    private Number nWithdraw;
    
    @Column(name = "nDepositx")
    private Number nDepositx;
    
    @Column(name = "nCloseAmt")
    private Number nCloseAmt;
    
    @Column(name = "sCashierx")
    private String sCashierx;
    
    @Column(name = "cTranStat")
    private String cTranStat;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCashDrawer(){
        sTransNox = "";
        sTranDate = "";
        sBranchCd = "";
        nOpenAmtx = 0.00;
        nCashAmtx = 0.00;
        nCheckAmt = 0.00;
        nChargexx = 0.00;
        nCredtCrd = 0.00;
        nGiftCert = 0.00;
        nFinAmntx = 0.00;
        nWithdraw = 0.00;
        nDepositx = 0.00;
        nCloseAmt = 0.00;
        sCashierx = "";
        cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sTranDate");
        laColumns.add("sBranchCd");
        laColumns.add("nOpenAmtx");
        laColumns.add("nCashAmtx");
        laColumns.add("nCheckAmt");
        laColumns.add("nChargexx");
        laColumns.add("nCredtCrd");
        laColumns.add("nGiftCert");
        laColumns.add("nFinAmntx");
        laColumns.add("nWithdraw");
        laColumns.add("nDepositx");
        laColumns.add("nCloseAmt");
        laColumns.add("sCashierx");
        laColumns.add("cTranStat");
        laColumns.add("dModified");
    }
    
    public void setTransactionNo(String fsValue){
        sTransNox = fsValue;
    }
    public String getTransactionNo(){
        return sTransNox;
    }
    
    public void setTranDate(String fsValue){
        sTranDate = fsValue;
    }
    public String getTranDate(){
        return sTranDate;
    }
    
    public void setBranchCode(String fsValue){
        sBranchCd = fsValue;
    }
    public String getBranchCode(){
        return sBranchCd;
    }
    
    public void setOpeningBalance(Number fnValue){
        nOpenAmtx = fnValue;
    }
    public Number getOpeningBalance(){
        return nOpenAmtx;
    }
    
    public void setCashAmount(Number fnValue){
        nCashAmtx = fnValue;
    }
    public Number getCashAmount(){
        return nCashAmtx;
    }
    
    public void setCheckAmount(Number fnValue){
        nCheckAmt = fnValue;
    }
    public Number getCheckAmount(){
        return nCheckAmt;
    }
    
    public void setChargeAmount(Number fnValue){
        nChargexx = fnValue;
    }
    public Number getChargeAmount(){
        return nChargexx;
    }
    
    public void setCreditCardAmount(Number fnValue){
        nCredtCrd = fnValue;
    }
    public Number getCreditCardAmount(){
        return nCredtCrd;
    }
    
    public void setGiftCertAmount(Number fnValue){
        nGiftCert = fnValue;
    }
    public Number getGiftCertAmount(){
        return nGiftCert;
    }
    
    public void setFinanceAmount(Number fnValue){
        nFinAmntx = fnValue;
    }
    public Number getFinanceAmount(){
        return nFinAmntx;
    }
    
    public void setWithdrawAmount(Number fnValue){
        nWithdraw = fnValue;
    }
    public Number getWithdrawAmount(){
        return nWithdraw;
    }
    
    public void setDepositAmount(Number fnValue){
        nDepositx = fnValue;
    }
    public Number getDepositAmount(){
        return nDepositx;
    }
    
    public void setClosingAmount(Number fnValue){
        nCloseAmt = fnValue;
    }
    public Number getClosingAmount(){
        return nCloseAmt;
    }
    
    public void setCashier(String fsValue){
        sCashierx = fsValue;
    }
    public String getCashier(){
        return sCashierx;
    }
    
    public void setTranStatus(String fsValue){
        cTranStat = fsValue;
    }
    public String getTranStatus(){
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
        if (!(object instanceof UnitCashDrawer)) {
            return false;
        }
        UnitCashDrawer other = (UnitCashDrawer) object;
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
            case 2: return sTranDate;
            case 3: return sBranchCd;
            case 4: return nOpenAmtx;
            case 5: return nCashAmtx;
            case 6: return nCheckAmt;
            case 7: return nChargexx;
            case 8: return nCredtCrd;
            case 9: return nGiftCert;
            case 10: return nFinAmntx;
            case 11: return nWithdraw;
            case 12: return nDepositx;
            case 13: return nCloseAmt;
            case 14: return sCashierx;
            case 15: return cTranStat;
            case 16: return dModified;
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
        return "Cash_Drawer";
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
            case 2: sTranDate = (String) foValue; break;
            case 3: sBranchCd = (String) foValue; break;
            case 4: nOpenAmtx = (Number) foValue; break;
            case 5: nCashAmtx = (Number) foValue; break;
            case 6: nCheckAmt = (Number) foValue; break;
            case 7: nChargexx = (Number) foValue; break;
            case 8: nCredtCrd = (Number) foValue; break;
            case 9: nGiftCert = (Number) foValue; break;
            case 10: nFinAmntx = (Number) foValue; break;
            case 11: nWithdraw = (Number) foValue; break;
            case 12: nDepositx = (Number) foValue; break;
            case 13: nCloseAmt = (Number) foValue; break;
            case 14: sCashierx = (String) foValue; break;
            case 15: cTranStat = (String) foValue; break;
            case 16: dModified = (Date) foValue; break;
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