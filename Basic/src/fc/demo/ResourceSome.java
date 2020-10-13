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
		System.out.println("作一些事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Some被關閉");
	}
}

class ResourceClassOther implements AutoCloseable {
	void doOther() {
		System.out.println("作其它事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Other被關閉");
	}
}