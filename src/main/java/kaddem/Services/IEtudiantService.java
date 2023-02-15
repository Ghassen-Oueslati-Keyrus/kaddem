package kaddem.Services;

import kaddem.entities.Etudiant;
import kaddem.entities.Niveau;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    public List<Etudiant> findByDepartmentIdDepartment(Long idDepartment);
    public List<Etudiant>findByequipesNiveauSenior();
}
