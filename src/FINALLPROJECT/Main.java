package Main;

import controller.KhachHangController;

import view.KhachHangView;

public class Main {
	public static void main(String[] args) {
		KhachHangView view = new KhachHangView();
		new KhachHangController(view);
		view.setVisible(true);
	}
}
