package utils;

/**
 * Utilitários do sistema
 * 
 * Esta classe é utilizada para definir métodos que são utilitários de diversas
 * partes do sitema.
 * 
 * @author Vitor Peres
 *
 */
public class Validators {

	static public boolean onlyValidchars(String verify) {

		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
	}
}
