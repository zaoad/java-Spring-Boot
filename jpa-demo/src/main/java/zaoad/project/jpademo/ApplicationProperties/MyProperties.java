package zaoad.project.jpademo.ApplicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties
@PropertySource("classpath:application.properties")
public class MyProperties {
    String name;
    Zaoad zaoad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zaoad getZaoad() {
        return zaoad;
    }

    public void setZaoad(Zaoad zaoad) {
        this.zaoad = zaoad;
    }

    //    public static class Zaoad{
//        Org org;
//        public Org getOrg() {
//            return org;
//        }
//
//        public void setOrg(Org org) {
//            this.org = org;
//        }
//        public static class Org{
//            String pritamgmailcom;
//            String zaoadgmailcom;
//
//            public String getPritamgmailcom() {
//                return pritamgmailcom;
//            }
//
//            public void setPritamgmailcom(String pritamgmailcom) {
//                this.pritamgmailcom = pritamgmailcom;
//            }
//
//            public String getZaoadgmailcom() {
//                return zaoadgmailcom;
//            }
//
//            public void setZaoadgmailcom(String zaoadgmailcom) {
//                this.zaoadgmailcom = zaoadgmailcom;
//            }
//            public List<String> getOrgSms()
//            {
//                List<String> numberOfSmsPerOrg=new ArrayList<>();
//                numberOfSmsPerOrg.add(pritamgmailcom);
//                numberOfSmsPerOrg.add(zaoadgmailcom);
//                return numberOfSmsPerOrg;
//            }
//        }
//    }
    public static class Zaoad{
        String[] orgs;

        public void setOrg(Org org) {
            this.org = org;
        }

        public Org getOrg() {
            return org;
        }

        Org org;
        public String[] getOrgs() {
            return orgs;
        }

        public void setOrgs(String[] orgs) {
            this.orgs = orgs;
        }
        public static class Org{
            Integer[] sms;
            public Integer[] getSms() {
                return sms;
            }

            public void setSms(Integer[] sms) {
                this.sms = sms;
            }


        }
    }


}

