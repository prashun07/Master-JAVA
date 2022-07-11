package RickApplicationOOD;

public enum Type {
    ELECTRIC,ACOUSTIC;

    @Override
    public String toString() {
        switch (this){
            case ACOUSTIC :return "ACOUSTIC";
            case ELECTRIC: return "ELECTRIC";
        }
        return "";
    }
}
