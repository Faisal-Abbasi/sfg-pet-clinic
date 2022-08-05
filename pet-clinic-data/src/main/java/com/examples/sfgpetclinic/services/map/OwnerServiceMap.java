package com.examples.sfgpetclinic.services.map;

import com.examples.sfgpetclinic.model.Owner;
import com.examples.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
     super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner objects) {
        return super.save(objects.getId(),objects);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

