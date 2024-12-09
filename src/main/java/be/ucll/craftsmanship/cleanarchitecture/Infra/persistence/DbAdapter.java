package be.ucll.craftsmanship.cleanarchitecture.Infra.persistence;

public interface DbAdapter <DbEntity, DomainEntity>{
    DbEntity mapToDb(DomainEntity domainEntity);
    DomainEntity mapFromDb(DbEntity dbEntity);
}
