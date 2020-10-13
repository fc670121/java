package fc.demo;

public class ResourceSome {

	public static void main(String[] args) {
		try (ResourceClassSome some = new ResourceClassSome(); ResourceClassOther other = new ResourceClassOther()) {
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

class ResourceClassSome implements AutoCloseable {
	void doSome() {
		System.out.println("�@�@�Ǩ�");
	}

	@Override
	public void close() throws Exception {
		System.out.println("�귽Some�Q����");
	}
}

class ResourceClassOther implements AutoCloseable {
	void doOther() {
		System.out.println("�@�䥦��");
	}

	@Override
	public void close() throws Exception {
		System.out.println("�귽Other�Q����");
	}
}