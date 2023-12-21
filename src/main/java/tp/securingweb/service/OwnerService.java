package tp.securingweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.securingweb.Entity.Owner;
import tp.securingweb.Repository.OwnerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    private final OwnerRepo ownerRepository;

    @Autowired
    public OwnerService(OwnerRepo ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) {
        Optional<Owner> owner = ownerRepository.findById(id);
        return owner.orElse(null);
    }

    public Boolean createOwner(Owner owner) {
        if (ownerRepository.existsById(owner.getId())){

            return false;
        }
        ownerRepository.save(owner);
        return true;
    }

    public Owner updateOwner(Long id, Owner updatedOwner) {
        Optional<Owner> existingOwnerOptional = ownerRepository.findById(id);

        if (existingOwnerOptional.isPresent()) {
            Owner existingOwner = existingOwnerOptional.get();

            // Update properties of existingOwner with values from updatedOwner
            // You can use setters or any other method based on your entity structure

            return ownerRepository.save(existingOwner);
        }

        return null;
    }

    public boolean deleteOwner(Long id){
        if (ownerRepository.existsById(id)){
            ownerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

