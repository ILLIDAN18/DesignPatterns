package CreationalPatterns;

//一个抽象的手机类和两个具体的手机类
interface Phone {
    void showPhoneInfor();
}

class HWPhone implements Phone {

    @Override
    public void showPhoneInfor() {
        System.out.println("This is a HUAWEI Phone.");
    }
}

class MIPhone implements Phone {

    @Override
    public void showPhoneInfor() {
        System.out.println("This is a MI Phone.");
    }
}

//一个抽象的工厂类和两个具体的工厂类
interface PhoneFactory {
    Phone createPhone();
}

class HWFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        HWPhone hwPhone = new HWPhone();
        return hwPhone;
    }
}

class MIFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        MIPhone miPhone = new MIPhone();
        return miPhone;
    }
}

//客户端程序，通过不同的工厂创建手机
public class FactoryMethod {
    public static void main(String[] args) {

        Phone hwPhone = new HWFactory().createPhone();
        hwPhone.showPhoneInfor();
        Phone miPhone = new MIFactory().createPhone();
        miPhone.showPhoneInfor();
    }
}
