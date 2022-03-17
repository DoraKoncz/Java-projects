package view;

import java.util.Scanner;

import controller.ListaCtrl;

public class ListaView {

	private Scanner scanner;
	private ListaCtrl controller;

	public ListaView() {
		this.scanner = new Scanner(System.in);
		this.controller = new ListaCtrl();
	}

	public static void main(String[] args) {

		ListaView lv = new ListaView();

		boolean continua = true;

	}
}
