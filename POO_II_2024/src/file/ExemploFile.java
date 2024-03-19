package file;

import java.io.File;

import javax.swing.JOptionPane;

public class ExemploFile {
	public static void main(String[] args) {
		String menu = "1 - Listar\n" + "2 - Apagara todos\n" + "3 - Sair";
		int op = 0;
		File[] arguments = null;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				String dir = JOptionPane.showInputDialog("Path");
				File d = new File(dir);
				if (d.isDirectory()) {
					arguments = d.listFiles();
					for (File f : arguments) {
						System.out.println(f.getName() + " - " + (f.length() / 1024 + " KB"));
					}
				} else {
					System.out.println("Caminho inválido");
				}
			} else if (op == 2) {
				for (File f : arguments) {
					f.delete();
				}
			}
		} while (op != 3);
	}
}
