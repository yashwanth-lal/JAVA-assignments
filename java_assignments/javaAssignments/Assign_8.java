package javaAssignments;

class InvalidCvvException extends Exception {
    public InvalidCvvException (String str){
        super(str);
    }

}
class InvalidATMException extends Exception{
    public InvalidATMException(String str){
        super(str);
    }
}
class InvalidOtpException extends Exception{

    public InvalidOtpException(String str){

        super(str);
    }
}
class Verify extends Exception{
    public void CheckDetails(String cvv,String atm,String otp) throws InvalidATMException,InvalidCvvException,InvalidOtpException{
        if(atm.length() !=16){
            throw new InvalidATMException("Wrong ATM number inserted");
        }
        if(cvv.length() !=3){
            throw new InvalidCvvException("Wrong CVV inserted");
        }
        if(otp.length() !=4){
            throw new InvalidOtpException("Invalid OTP");
        }
    }
}
class DemoException {
    public static void main(String[] args) {
        Verify obj = new Verify();
        try {
            obj.CheckDetails("134", "3435655678956734", "2394");
        }catch (InvalidATMException | InvalidCvvException | InvalidOtpException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exception not caught.");
        }
    }
}