package sealed;

public class Ex {
    public static void main(String[] args) {

        class FamilyPlus extends FamilySub {
        }

        Subscription[] subscriptions = {
                new FreeSub(),
                new PremiumSub(),
                new FamilySub(),
                new FamilyPlus()
        };

        for (Subscription subscription : subscriptions) {
            System.out.println(describe(subscription));
        }
    }

    private static String describe(Subscription subscription) {
        if (subscription instanceof FreeSub) {
            return "Free subscription";
        }
        if (subscription instanceof PremiumSub) {
            return "Premium subscription";
        }
        if (subscription instanceof FamilySub) {
            return "Family subscription (or subclass, because FamilySub is non-sealed)";
        }
        return null;
    }
}
