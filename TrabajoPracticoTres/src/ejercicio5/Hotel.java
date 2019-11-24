package ejercicio5;

public class Hotel {

		private String nombre;
		private String localidad;
		private int habitacionesTotales;
		private int habitacionesDisponibles;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getLocalidad() {
			return localidad;
		}
		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}
		public int getHabitacionesTotales() {
			return habitacionesTotales;
		}
		public void setHabitacionesTotales(int habitacionesTotales) {
			this.habitacionesTotales = habitacionesTotales;
		}
		public int getHabitacionesDisponibles() {
			return habitacionesDisponibles;
		}
		public void setHabitacionesDisponibles(int habitacionesDisponibles) {
			this.habitacionesDisponibles = habitacionesDisponibles;
		}
		@Override
		public String toString() {
			return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habitacionesTotales="
					+ habitacionesTotales + ", habitacionesDisponibles=" + habitacionesDisponibles + "]";
		}
		public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesDisponibles) {
			this.nombre = nombre;
			this.localidad = localidad;
			this.habitacionesTotales = habitacionesTotales;
			this.habitacionesDisponibles = habitacionesDisponibles;
		}
		
		public boolean ocuparHabitaciones(int solicitadas) {
			if (solicitadas>this.getHabitacionesDisponibles()) {
				return false;
			} else {
				this.setHabitacionesDisponibles(this.getHabitacionesDisponibles()-solicitadas);
				return true;
			}
		}
		
		public boolean desocuparHabitaciones(int desocupar) {
			if (this.getHabitacionesDisponibles()+desocupar>this.getHabitacionesTotales()) {
				return false;
			} else {
				this.setHabitacionesDisponibles(getHabitacionesDisponibles()+desocupar);
				return true;
			}
		}

		

}
