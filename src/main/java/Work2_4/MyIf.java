package Work2_4;

public interface MyIf {
    int getUserID();

    default int getAdminID() {
        return 1;
    }
}
