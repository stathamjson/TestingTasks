package yandex;

//public abstract class Bank {
//    protected Office office = buildOffice();
//    protected List<Employee> staff = Staff.hireEmployees();
//
//    public void transfer(Client a, Client b, double amount, String currency) {
//        a.documents.passport.seriesAndNumber.validate();
//
//        if (a.type == "type1") {
//            // do something
//        } else if (a.type == "type2") {
//            // do another thing
//        } else if (a.type == "type3") {
//            // do other thing
//        }
//
//        // ...
//    }
//
//    public abstract Office buildOffice();
//
//    // invoked on every frame update on UI
//    public UIBankInfo render() {
//        UIBankInfo bankInfoFrame = new UIBankInfo();
//        bankInfoFrame.setBankInfo(generateBankInfo());
//        // ...
//
//        return bankInfoFrame;
//    }
//
//    public BankInfo generateBankInfo() {
//        BankInfo bankInfo = new BankInfo();
//        // ...
//
//        return bankInfo;
//    }
//}
//
///**
// * Есть абстрактный класс, от него класс СберКарта. Что бы ты изменил, что тут плохо пахнет?
// *
// * a.documents.passport.seriesAndNumber.validate();
// * доставать значения нужно через геттеры, метод validate не должен содержаться в классе с данными
// *
// * 30 строка - сделать метод private
// *
// * при переопределении методов желательно использовать аннотацию оверрайд
// *
// * в 46-й строке отправляется почта из метода, который генерирует банкИнфо
// *
// * короче много косяков =)
// */
//
//public class SberBank extends Bank {
//    public Office buildOffice() {
//        OfficeBuilder builder = new SomeBuildingCompany();
//        return builder.use(staff).buildOffice();
//    }
//
//    public BankInfo generateBankInfo() {
//        BankInfo bankInfo = super.generateBankInfo();
//        notifyEmail(Config.getAdminEmail());
//
//        return bankInfo;
//    }
//}