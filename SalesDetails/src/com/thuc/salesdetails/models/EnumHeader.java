package com.thuc.salesdetails.models;

public class EnumHeader{

    public enum INVTSERV {
        CASH(2), 
        TILL(4),
        BILL(5),
        TYPE(7),
        CUSTOMER_ID(15),
        SKU(25),
        DEPT(26),
        SUB_DEPT(27),
        CLASS(28),
        SUB_CLASS(29),
        VENDOR(30),
        TIME(34),
        QUANTITY(35),
        PRICE_ORIGINAL(37),
        PRICE_SELL(46),
        VALUE(48),
        UPC(103),
        DESCR(139),
        SHORT_DESCR(140),
        EVALUE(203);
    
        private final int headerCode;
        INVTSERV(int headerCode) {
            this.headerCode = headerCode;
        }   
        public int getCode() {
            return this.headerCode;
        }
    }
}