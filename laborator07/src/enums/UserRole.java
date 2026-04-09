package enums;

public enum UserRole {

    ADMIN {
        @Override
        public String getPermissions() {
            return "Full access to all features.";
        }
    },
    USER {
        @Override
        public String getPermissions() {
            return "Limited access to features.";
        }
    },
    GUEST {
        @Override
        public String getPermissions() {
            return "Read-only access.";
        }
    };

    public abstract String getPermissions();

}
