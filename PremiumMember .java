class PremiumMember extends Member {

    PremiumMember(String name, String phone, int age) {
        super(name, phone, age);
    }

    void showPackage() {
        System.out.println(getName() + " has Premium Membership");
    }
}
