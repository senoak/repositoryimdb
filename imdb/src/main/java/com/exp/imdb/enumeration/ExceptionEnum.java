package com.exp.imdb.enumeration;

public enum ExceptionEnum {
	SECCESS(200,"Başarılı"),
	INTERNAL_ERROR(203,"Bir hata oluştu, lütfen sistem yöneticinize başvurun."),
    INVALID_PARAMETERS(204,"Girmiş olduğun bilgiler hatalı. Lütfen kontrol ederek, yeniden deneyin."),
	NO_RECORD_FOUND(205,"Kayıt bulunmamaktadır.");



    private int code;
    private String message;

    private ExceptionEnum(int code,String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }
    public String getMessage() {
    	return this.message;
    }

}
