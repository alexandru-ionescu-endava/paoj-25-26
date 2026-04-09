package enums;

public class Ex {
    public static void main(String[] args) {

        System.out.println(Genre.POP);

        System.out.println("ordinal demo only: " + Genre.POP.ordinal());
        System.out.println("Use name() or explicit fields for stable persistence, not ordinal().");

        Genre genre = Genre.POP;
        switch (genre) {
            case POP:
                System.out.println("Pop music");
                break;
            case ROCK:
                System.out.println("Rock music");
                break;
            case JAZZ:
                System.out.println("Jazz music");
                break;
            case CLASSICAL:
                System.out.println("Classical music");
                break;
            case HIP_HOP:
                System.out.println("Hip-hop music");
                break;
            case ELECTRONIC:
                System.out.println("Electronic music");
                break;
        }


        System.out.println("===");

        for (Quality g : Quality.values()) {
            System.out.println(g.name() + " " + g.getBitRate() + "kbps");
        }

        System.out.println("===");

        UserRole role = UserRole.ADMIN;
        System.out.println(role.getPermissions());
        UserRole[] roles = UserRole.values();
        for (UserRole r : roles) {
            System.out.println(r + ": " + r.getPermissions());
        }

    }
}
