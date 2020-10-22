package web.controller;

@RestController
public class ProductController {
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }
}
