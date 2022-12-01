package cn.tunyl.lawofdemeter;

public class Client {
    public static void main(String[] args) {
        Star star = new Star("刘~~");
        Fans fans = new Fans("张三");
        Company company = new Company("传媒公司");
        Agent agent  = new Agent();
        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
