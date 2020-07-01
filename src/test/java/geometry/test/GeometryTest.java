package geometry.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.WKTReader;

public class GeometryTest {
	
	private static WKTReader reader;

	@BeforeAll
	public static void initTests() {
		reader = new WKTReader();
	}

	@Test
	public void testFixGeometry() throws Exception {
		String wktError = "MULTIPOLYGON ("
				+ "((1764821.349985 4897058.789998, 1764821.349425 4897058.794803, 1764821.349985 4897058.789998)), "
				+ "((1764821.34997 4897058.789997, 1764818.68 4897058.5, 1764812.591783 4897057.108204, 1764819.560837 4896999.356852, 1764801.447089 4896996.63796, 1764802.126355 4896987.574986, 1764827.938445 4896990.067304, 1764830.429086 4896964.011253, 1764832.740144 4896964.29157, 1764832.226208 4896968.528816, 1764833.728522 4896968.674128, 1764833.726376 4896968.721375, 1764832.22 4896968.58, 1764823.96 4897035.76, 1764826.244162 4897035.937929, 1764826.243892 4897035.940238, 1764823.961426 4897035.762083, 1764821.34997 4897058.789997))"
				+ ")";
		Geometry geometry = reader.read(wktError);
		assertTrue(geometry.isValid(), "Invalid geometry");
	}

}
