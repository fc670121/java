package fc.demo.connect;

public interface ClientListener {
    void clientAdded(ClientEvent event);    // �s�WClient�|�I�s�o�Ӥ�k
    void clientRemoved(ClientEvent event); // ����Client�|�I�s�o�Ӥ�k
}
