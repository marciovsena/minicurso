package app1.ontologies;

/* CVS $Id: $ */
 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from C:\Users\Ernesto\Dropbox\UFG\EST�GIO EM DOC�NCIA\sugestoesdeprojetos\foaf.owl 
 * @author Auto-generated by schemagen on 25 Out 2014 16:58 
 */
public class Foaf {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final ObjectProperty account = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#account" );
    
    public static final ObjectProperty accountServiceHomepage = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#accountServiceHomepage" );
    
    public static final ObjectProperty aimChatID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#aimChatID" );
    
    public static final ObjectProperty based_near = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#based_near" );
    
    public static final ObjectProperty currentProject = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#currentProject" );
    
    public static final ObjectProperty depiction = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#depiction" );
    
    public static final ObjectProperty depicts = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#depicts" );
    
    public static final ObjectProperty homepage = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#homepage" );
    
    public static final ObjectProperty icqChatID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#icqChatID" );
    
    public static final ObjectProperty img = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#img" );
    
    public static final ObjectProperty interest = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#interest" );
    
    public static final ObjectProperty isPrimaryTopicOf = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#isPrimaryTopicOf" );
    
    public static final ObjectProperty jabberID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#jabberID" );
    
    public static final ObjectProperty knows = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#knows" );
    
    public static final ObjectProperty logo = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#logo" );
    
    public static final ObjectProperty made = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#made" );
    
    public static final ObjectProperty maker = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#maker" );
    
    public static final ObjectProperty mbox = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#mbox" );
    
    public static final ObjectProperty mbox_sha1sum = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#mbox_sha1sum" );
    
    public static final ObjectProperty member = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#member" );
    
    public static final ObjectProperty msnChatID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#msnChatID" );
    
    public static final ObjectProperty myersBriggs = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#myersBriggs" );
    
    public static final ObjectProperty openid = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#openid" );
    
    public static final ObjectProperty page = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#page" );
    
    public static final ObjectProperty pastProject = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#pastProject" );
    
    public static final ObjectProperty plan = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#plan" );
    
    public static final ObjectProperty primaryTopic = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#primaryTopic" );
    
    public static final ObjectProperty publications = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#publications" );
    
    public static final ObjectProperty schoolHomepage = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#schoolHomepage" );
    
    public static final ObjectProperty skypeID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#skypeID" );
    
    public static final ObjectProperty thumbnail = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#thumbnail" );
    
    public static final ObjectProperty tipjar = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#tipjar" );
    
    public static final ObjectProperty topic = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#topic" );
    
    public static final ObjectProperty topic_interest = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#topic_interest" );
    
    public static final ObjectProperty weblog = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#weblog" );
    
    public static final ObjectProperty workInfoHomepage = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#workInfoHomepage" );
    
    public static final ObjectProperty workplaceHomepage = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#workplaceHomepage" );
    
    public static final ObjectProperty yahooChatID = m_model.createObjectProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#yahooChatID" );
    
    public static final DatatypeProperty accountName = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#accountName" );
    
    public static final DatatypeProperty familyName = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#familyName" );
    
    public static final DatatypeProperty firstName = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#firstName" );
    
    public static final DatatypeProperty gender = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#gender" );
    
    public static final DatatypeProperty givenName = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#givenName" );
    
    public static final DatatypeProperty lastName = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#lastName" );
    
    public static final DatatypeProperty name = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#name" );
    
    public static final DatatypeProperty nick = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#nick" );
    
    public static final DatatypeProperty phone = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#phone" );
    
    public static final DatatypeProperty title = m_model.createDatatypeProperty( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#title" );
    
    public static final OntClass Agent = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Agent" );
    
    public static final OntClass Document = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Document" );
    
    public static final OntClass Group = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Group" );
    
    public static final OntClass Image = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Image" );
    
    public static final OntClass OnLineAccount = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#OnLineAccount" );
    
    public static final OntClass Organization = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Organization" );
    
    public static final OntClass Person = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Person" );
    
    public static final OntClass PersonalProfileDocument = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#PersonalProfileDocument" );
    
    public static final OntClass Project = m_model.createClass( "http://www.semanticweb.org/ontologies/2013/10/foaf.owl#Project" );
    
    //public static final Individual ErnestoFonsecaVeiga = m_model.createIndividual( "http://www.w3.org/2006/vcard/ns#ErnestoFonsecaVeiga", Person );
    
}
