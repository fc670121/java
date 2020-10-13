package fc.demo;

import java.util.*;

interface Request {
	void execute();
}

public class RequestQueue {

	public static void main(String[] args) {
		Queue<Request> requests = new LinkedList<>();
		offerRequestTo(requests);
		process(requests);
	}

	static void offerRequestTo(Queue<Request> requests) {
		// �����N�ШD�[�J��C
		for (int i = 1; i < 6; i++) {
			requests.offer(() -> System.out.printf("�B�z��� %f%n", Math.random()));
		}
	}

	// �B�z��C�����ШD
	static void process(Queue<Request> requests) {
		while (requests.peek() != null) {
			Request request = requests.poll();
			request.execute();
		}
	}
}