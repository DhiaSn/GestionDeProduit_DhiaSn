package tn.esprit.dhou.gestiondeproduit_dhiasn.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());

    }
    public Contact contactAPI() {
        return new Contact().name("Dhou Contact")
                .email("dhia.snoussi@esprit.tn")
                .url("https://www.linkedin.com/in/dhia-snoussi/");
    }

    @Bean
    public GroupedOpenApi clientPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Client Management API")
                .pathsToMatch("/Client/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Product Management API")
                .pathsToMatch("/Produit/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi fournisseurPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Fournisseur Management API")
                .pathsToMatch("/Fournisseur/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi detailProduitPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only DetailProduit Management API")
                .pathsToMatch("/DetailProduit/**")
                .pathsToExclude("**")
                .build();

    }

    @Bean
    public GroupedOpenApi detailFacturePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only DetailFacture Management API")
                .pathsToMatch("/DetailFacture/**")
                .pathsToExclude("**")
                .build();

    }
    @Bean
    public GroupedOpenApi facturePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Facture Management API")
                .pathsToMatch("/Facture/**")
                .pathsToExclude("**")
                .build();

    }

    @Bean
    public GroupedOpenApi rayonPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Rayon Management API")
                .pathsToMatch("/Rayon/**")
                .pathsToExclude("**")
                .build();

    }
    @Bean
    public GroupedOpenApi stockPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Stock Management API")
                .pathsToMatch("/Stock/**")
                .pathsToExclude("**")
                .build();

    }
}
