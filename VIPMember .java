class VIPMember extends Member {

    VIPMember(String name, String phone, int age) {
        super(name, phone, age);
    }

    void showPackage() {
        System.out.println(getName() + " has VIP Membership");
    }
}
