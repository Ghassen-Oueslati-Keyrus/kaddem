package kaddem.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import kaddem.entities.Etudiant;
import kaddem.entities.Niveau;
import kaddem.repositories.EtudiantRepository;
import kaddem.Services.IEtudiantService;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        // TODO Auto-generated method stub
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        // TODO Auto-generated method stub
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        // TODO Auto-generated method stub
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        // TODO Auto-generated method stub
        return etudiantRepository.getReferenceById(idEtudiant);
    }

    @Override
    public List<Etudiant> findByDepartmentIdDepartment(Long idDepartment) {
        // TODO Auto-generated method stub
        return etudiantRepository.findByDepartmentIdDepartment(idDepartment);
    }

    @Override
    public List<Etudiant> findByequipesNiveauSenior() {
        // TODO Auto-generated method stub
        Niveau n=Niveau.SENIOR;
        return etudiantRepository.findByEquipesNiveau(n);
    }

}