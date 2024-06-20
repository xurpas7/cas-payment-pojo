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
@Table(name="Receipt_Master")

public class UnitReceiptMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sORNumber")
    private String sORNumber;
    
    @Column(name = "nVATSales")
    private Number nVATSales;
    
    @Column(name = "nVATAmtxx")
    private Number nVATAmtxx;
    
    @Column(name = "nNonVATSl")
    private Number nNonVATSl;
    
    @Column(name = "nZroVATSl")
    private Number nZroVATSl;
    
    @Column(name = "nCWTAmtxx")
    private Number nCWTAmtxx;
    
    @Column(name = "nAdvPaymx")
    private Number nAdvPaymx;
    
    @Column(name = "nCashAmtx")
    private Number nCashAmtx;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "sCashierx")
    private String sCashierx;
    
    @Column(name = "cPrintedx")
    private String cPrintedx;
    
    @Column(name = "cTranStat")
    private String cTranStat;
        
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitReceiptMaster(){
        this.sTransNox = "";
        this.sORNumber = "";
        this.nVATSales = 0.00;
        this.nVATAmtxx = 0.00;
        this.nNonVATSl = 0.00;
        this.nZroVATSl = 0.00;
        this.nCWTAmtxx = 0.00;
        this.nAdvPaymx = 0.00;
        this.nCashAmtx = 0.00;
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.sCashierx = "";
        this.cPrintedx = "0";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sORNumber");
        laColumns.add("nVATSales");
        laColumns.add("nVATAmtxx");
        laColumns.add("nNonVATSl");
        laColumns.add("nZroVATSl");
        laColumns.add("nCWTAmtxx");
        laColumns.add("nAdvPaymx");
        laColumns.add("nCashAmtx");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("sCashierx");
        laColumns.add("cPrintedx");
        laColumns.add("cTranStat");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setInvNmber(String sInvNumbr){
        this.sORNumber = sInvNumbr;
    }
    public String getInvNmber(){
        return sORNumber;
    }
    
    public void setVATSales(Number nVATSales){
        this.nVATSales = nVATSales;
    }
    public Number getVATSales(){
        return nVATSales;
    }
    
    public void setVATAmtxx(Number nVATAmtxx){
        this.nVATAmtxx = nVATAmtxx;
    }
    public Number getVATAmtxx(){
        return nVATAmtxx;
    }
    
    public void setNonVATSl(Number nNonVATSl){
        this.nNonVATSl = nNonVATSl;
    }
    public Number getNonVATSl(){
        return nNonVATSl;
    }
    
    public void setZroVATSl(Number nZroVATSl){
        this.nZroVATSl = nZroVATSl;
    }
    public Number getZroVATSl(){
        return nZroVATSl;
    }
    
    public void setCWTAmtxx(Number nCWTAmtxx){
        this.nCWTAmtxx = nCWTAmtxx;
    }
    public Number setCWTAmtxx(){
        return nCWTAmtxx;
    }
    
    public void setAdvPaymx(Number nAdvPaymx){
        this.nAdvPaymx = nAdvPaymx;
    }
    public Number setAdvPaymx(){
        return nAdvPaymx;
    }
    
    public void setCashAmtx(Number nCashAmtx){
        this.nCashAmtx = nCashAmtx;
    }
    public Number getCashAmtx(){
        return nCashAmtx;
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
    
    public void setCashier(String sCashierx){
        this.sCashierx = sCashierx;
    }
    public String getCashier(){
        return sCashierx;
    }
    
    public void setPrinted(String cPrintedx){
        this.cPrintedx = cPrintedx;
    }
    public String getPrinted(){
        return cPrintedx;
    }
    
    public void setTranStatus(String cTranStat){
        this.cTranStat = cTranStat;
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
        if (!(object instanceof UnitReceiptMaster)) {
            return false;
        }
        UnitReceiptMaster other = (UnitReceiptMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.paymentfx.pojo.UnitReceiptMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sORNumber;
            case 3: return nVATSales;
            case 4: return nVATAmtxx;
            case 5: return nNonVATSl;
            case 6: return nZroVATSl;
            case 7: return nCWTAmtxx;
            case 8: return nAdvPaymx;
            case 9: return nCashAmtx;
            case 10: return sSourceCd;
            case 11: return sSourceNo;
            case 12: return sCashierx;
            case 13: return cPrintedx;
            case 14: return cTranStat;
            case 15: return dModified;
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
        return "Receipt_Master";
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
            case 2: sORNumber = (String) foValue; break;
            case 3: nVATSales = (Number) foValue; break;
            case 4: nVATAmtxx = (Number) foValue; break;
            case 5: nNonVATSl = (Number) foValue; break;
            case 6: nZroVATSl = (Number) foValue; break;
            case 7: nCWTAmtxx = (Number) foValue; break;
            case 8: nAdvPaymx = (Number) foValue; break;
            case 9: nCashAmtx = (Number) foValue; break;
            case 10: sSourceCd = (String) foValue; break;
            case 11: sSourceNo = (String) foValue; break;
            case 12: sCashierx = (String) foValue; break;
            case 13: cPrintedx = (String) foValue; break;
            case 14: cTranStat = (String) foValue; break;
            case 15: dModified = (Date) foValue; break;
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