package tp.securingweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tp.securingweb.Entity.Owner;
import tp.securingweb.service.OwnerService;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public ResponseEntity<List<Owner>> getAllOwners() {
        List<Owner> owners = ownerService.getAllOwners();
        return new ResponseEntity<>(owners, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id) {
        Owner owner = ownerService.getOwnerById(id);
        return owner != null
                ? new ResponseEntity<>(owner, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner) {
        Owner createdOwner = ownerService.createOwner(owner);
        return new ResponseEntity<>(createdOwner, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Owner> updateOwner(@PathVariable Long id, @RequestBody Owner owner) {
        Owner updatedOwner = ownerService.updateOwner(id, owner);
        return updatedOwner != null
                ? new ResponseEntity<>(updatedOwner, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long id) {
        boolean deleted = ownerService.deleteOwner(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

