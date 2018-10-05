public class cohete {

		private static int numcohetes = 0;
		
		cohete() {
			numcohetes++;
		}
		
		public int getcohetes () {
			return numcohetes;
		}
}

