import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

    @Test
    void testCalcularDescuento() {
        GestorTienda tienda = new GestorTienda();
        
        assertEquals(10.0, tienda.calcularDescuento(100, 10));
        assertEquals(5.0, tienda.calcularDescuento(100, 5)); 
        assertEquals(0.0, tienda.calcularDescuento(100, 1)); 
    }

    @Test
    void testCategorizarProducto() {
        GestorTienda tienda = new GestorTienda();
        
        assertEquals("Económico", tienda.categorizarProducto(5));
        assertEquals("Estándar", tienda.categorizarProducto(20));
        assertEquals("Premium", tienda.categorizarProducto(100));
    }

    @Test
    void testBuscarProducto() {
        GestorTienda tienda = new GestorTienda();
        String[] inventario = {"Manzana", "Banana", "Cereza"};
        
        assertEquals("Banana", tienda.buscarProducto(inventario, "Banana"));
        assertNull(tienda.buscarProducto(inventario, "Uva"));
    }
}

