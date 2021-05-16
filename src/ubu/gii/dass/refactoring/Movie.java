package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5.
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {

	private String _title;
	MovieType _type;

	public Movie(String title, MovieType movieType) {
		_title = title;
		_type = movieType;
	}

	public MovieType getMovieType() {
		return _type;
	}

	public void setMovieType(MovieType movieType) {
		_type = movieType;
	}

	public String getTitle() {
		return _title;
	}
}
