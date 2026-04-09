package sealed;

public sealed class Subscription
        permits FreeSub, PremiumSub, FamilySub, TestSub {
}
