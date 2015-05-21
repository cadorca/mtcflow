/**
 * Generated with Acceleo
 */
package com.mtcflow.model.mtc.parts;

/**
 * 
 * 
 */
public class MtcViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * MTC view descriptor
	 * 
	 */
	public static class MTC_ {
		public static class Basic {
	
			
			public static String validateConformance = "mtc::MTC_::Basic::validateConformance";
			
			
			public static String name = "mtc::MTC_::Basic::name";
			
			
			public static String version = "mtc::MTC_::Basic::version";
			
			
			public static String m2MTechnology = "mtc::MTC_::Basic::M2MTechnology";
			
			
			public static String m2TTechnology = "mtc::MTC_::Basic::M2TTechnology";
			
			
			public static String hOTechnology = "mtc::MTC_::Basic::HOTechnology";
			
			
			public static String description = "mtc::MTC_::Basic::Description";
			
	
		}
	
		public static class Locations {
	
			
			public static String metamodelsFolder = "mtc::MTC_::Locations::metamodelsFolder";
			
			
			public static String modelsFolder = "mtc::MTC_::Locations::modelsFolder";
			
			
			public static String m2MTransformationsFolder = "mtc::MTC_::Locations::M2MTransformationsFolder";
			
			
			public static String m2TTransformationsFolder = "mtc::MTC_::Locations::M2TTransformationsFolder";
			
			
			public static String hOTransformationsFolder = "mtc::MTC_::Locations::HOTransformationsFolder";
			
			
			public static String librariesFolder = "mtc::MTC_::Locations::librariesFolder";
			
			
			public static String validationsFolder = "mtc::MTC_::Locations::validationsFolder";
			
			
			public static String workspace = "mtc::MTC_::Locations::workspace";
			
	
		}
	
		public static class Elements {
	
			
			public static String metamodels = "mtc::MTC_::Elements::metamodels";
			
			
			public static String models = "mtc::MTC_::Elements::models";
			
			
			public static String referencedResources = "mtc::MTC_::Elements::referencedResources";
			
			
			public static String transformations = "mtc::MTC_::Elements::transformations";
			
			
			public static String files = "mtc::MTC_::Elements::files";
			
			
			public static String inputModels = "mtc::MTC_::Elements::inputModels";
			
			
			public static String validations = "mtc::MTC_::Elements::validations";
			
			
			public static String outputModels = "mtc::MTC_::Elements::outputModels";
			
			
			public static String inputFiles = "mtc::MTC_::Elements::inputFiles";
			
			
			public static String outputFiles = "mtc::MTC_::Elements::outputFiles";
			
			
			public static String modelValidations = "mtc::MTC_::Elements::modelValidations";
			
			
			public static String decisions = "mtc::MTC_::Elements::decisions";
			
			
			public static String decisionInputModels = "mtc::MTC_::Elements::decisionInputModels";
			
	
		}
	
	}

	/**
	 * Metamodel view descriptor
	 * 
	 */
	public static class Metamodel {
		public static class Basic {
	
			
			public static String autoregister = "mtc::Metamodel::Basic::autoregister";
			
			
			public static String name = "mtc::Metamodel::Basic::name";
			
			
			public static String alias = "mtc::Metamodel::Basic::alias";
			
			
			public static String uRI = "mtc::Metamodel::Basic::URI";
			
			
			public static String metamodelURI = "mtc::Metamodel::Basic::metamodelURI";
			
			
			public static String description = "mtc::Metamodel::Basic::description";
			
			
			public static String technology = "mtc::Metamodel::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::Metamodel::Advanced::properties";
			
			
			public static String tags = "mtc::Metamodel::Advanced::tags";
			
			
			public static String referencedResources = "mtc::Metamodel::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * ReferencedResource view descriptor
	 * 
	 */
	public static class ReferencedResource {
		public static class Basic {
	
			
			public static String name = "mtc::ReferencedResource::Basic::name";
			
			
			public static String uRI = "mtc::ReferencedResource::Basic::URI";
			
			
			public static String type = "mtc::ReferencedResource::Basic::type";
			
			
			public static String description = "mtc::ReferencedResource::Basic::description";
			
			
			public static String technology = "mtc::ReferencedResource::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::ReferencedResource::Advanced::properties";
			
			
			public static String referencedResources = "mtc::ReferencedResource::Advanced::referencedResources";
			
			
			public static String tags = "mtc::ReferencedResource::Advanced::tags";
			
	
		}
	
	}

	/**
	 * File view descriptor
	 * 
	 */
	public static class File {
		public static class Basic {
	
			
			public static String name = "mtc::File::Basic::name";
			
			
			public static String uRI = "mtc::File::Basic::URI";
			
			
			public static String type = "mtc::File::Basic::type";
			
			
			public static String description = "mtc::File::Basic::description";
			
			
			public static String technology = "mtc::File::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::File::Advanced::properties";
			
			
			public static String tags = "mtc::File::Advanced::tags";
			
			
			public static String referencedResources = "mtc::File::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * Model view descriptor
	 * 
	 */
	public static class Model {
		public static class Basic {
	
			
			public static String name = "mtc::Model::Basic::name";
			
			
			public static String uRI = "mtc::Model::Basic::URI";
			
			
			public static String format = "mtc::Model::Basic::format";
			
			
			public static String description = "mtc::Model::Basic::description";
			
			
			public static String technology = "mtc::Model::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::Model::Advanced::properties";
			
			
			public static String metamodels = "mtc::Model::Advanced::metamodels";
			
			
			public static String tags = "mtc::Model::Advanced::tags";
			
			
			public static String referencedResources = "mtc::Model::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * Validation view descriptor
	 * 
	 */
	public static class Validation {
		public static class Basic {
	
			
			public static String name = "mtc::Validation::Basic::name";
			
			
			public static String uRI = "mtc::Validation::Basic::URI";
			
			
			public static String description = "mtc::Validation::Basic::description";
			
			
			public static String technology = "mtc::Validation::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::Validation::Advanced::properties";
			
			
			public static String tags = "mtc::Validation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::Validation::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * HOTransformation view descriptor
	 * 
	 */
	public static class HOTransformation {
		public static class Basic {
	
			
			public static String name = "mtc::HOTransformation::Basic::name";
			
			
			public static String uRI = "mtc::HOTransformation::Basic::URI";
			
			
			public static String target = "mtc::HOTransformation::Basic::target";
			
			
			public static String implementationClass = "mtc::HOTransformation::Basic::implementationClass";
			
			
			public static String description = "mtc::HOTransformation::Basic::description";
			
			
			public static String technology = "mtc::HOTransformation::Basic::technology";
			
			
			public static String preExecutionScript = "mtc::HOTransformation::Basic::preExecutionScript";
			
			
			public static String postExecutionScript = "mtc::HOTransformation::Basic::postExecutionScript";
			
	
		}
	
		public static class Libraries {
	
			
			public static String libraries_ = "mtc::HOTransformation::Libraries::libraries_";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::HOTransformation::Advanced::properties";
			
			
			public static String tags = "mtc::HOTransformation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::HOTransformation::Advanced::referencedResources";
			
			
			public static String outputTransformations = "mtc::HOTransformation::Advanced::outputTransformations";
			
	
		}
	
		public static class Dependencies {
	
			
			public static String modelDependencies = "mtc::HOTransformation::Dependencies::modelDependencies";
			
			
			public static String fileDependencies = "mtc::HOTransformation::Dependencies::fileDependencies";
			
	
		}
	
	}

	/**
	 * M2MTransformation view descriptor
	 * 
	 */
	public static class M2MTransformation {
		public static class Basic {
	
			
			public static String name = "mtc::M2MTransformation::Basic::name";
			
			
			public static String uRI = "mtc::M2MTransformation::Basic::URI";
			
			
			public static String implementationClass = "mtc::M2MTransformation::Basic::implementationClass";
			
			
			public static String description = "mtc::M2MTransformation::Basic::description";
			
			
			public static String technology = "mtc::M2MTransformation::Basic::technology";
			
			
			public static String preExecutionScript = "mtc::M2MTransformation::Basic::preExecutionScript";
			
			
			public static String postExecutionScript = "mtc::M2MTransformation::Basic::postExecutionScript";
			
	
		}
	
		public static class Libraries {
	
			
			public static String libraries_ = "mtc::M2MTransformation::Libraries::libraries_";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::M2MTransformation::Advanced::properties";
			
			
			public static String tags = "mtc::M2MTransformation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::M2MTransformation::Advanced::referencedResources";
			
	
		}
	
		public static class Dependencies {
	
			
			public static String modelDependencies = "mtc::M2MTransformation::Dependencies::modelDependencies";
			
			
			public static String fileDependencies = "mtc::M2MTransformation::Dependencies::fileDependencies";
			
	
		}
	
	}

	/**
	 * M2TTransformation view descriptor
	 * 
	 */
	public static class M2TTransformation {
		public static class Basic {
	
			
			public static String name = "mtc::M2TTransformation::Basic::name";
			
			
			public static String uRI = "mtc::M2TTransformation::Basic::URI";
			
			
			public static String target = "mtc::M2TTransformation::Basic::target";
			
			
			public static String implementationClass = "mtc::M2TTransformation::Basic::implementationClass";
			
			
			public static String description = "mtc::M2TTransformation::Basic::description";
			
			
			public static String technology = "mtc::M2TTransformation::Basic::technology";
			
			
			public static String preExecutionScript = "mtc::M2TTransformation::Basic::preExecutionScript";
			
			
			public static String postExecutionScript = "mtc::M2TTransformation::Basic::postExecutionScript";
			
	
		}
	
		public static class Libraries {
	
			
			public static String libraries_ = "mtc::M2TTransformation::Libraries::libraries_";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::M2TTransformation::Advanced::properties";
			
			
			public static String tags = "mtc::M2TTransformation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::M2TTransformation::Advanced::referencedResources";
			
	
		}
	
		public static class Dependencies {
	
			
			public static String fileDependencies = "mtc::M2TTransformation::Dependencies::fileDependencies";
			
			
			public static String modelDependencies = "mtc::M2TTransformation::Dependencies::modelDependencies";
			
	
		}
	
	}

	/**
	 * MTCTransformation view descriptor
	 * 
	 */
	public static class MTCTransformation {
		public static class Basic {
	
			
			public static String name = "mtc::MTCTransformation::Basic::name";
			
			
			public static String uRI = "mtc::MTCTransformation::Basic::URI";
			
			
			public static String target = "mtc::MTCTransformation::Basic::target";
			
			
			public static String implementationClass = "mtc::MTCTransformation::Basic::implementationClass";
			
			
			public static String description = "mtc::MTCTransformation::Basic::description";
			
			
			public static String technology = "mtc::MTCTransformation::Basic::technology";
			
			
			public static String preExecutionScript = "mtc::MTCTransformation::Basic::preExecutionScript";
			
			
			public static String postExecutionScript = "mtc::MTCTransformation::Basic::postExecutionScript";
			
	
		}
	
		public static class Libraries {
	
			
			public static String libraries_ = "mtc::MTCTransformation::Libraries::libraries_";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::MTCTransformation::Advanced::properties";
			
			
			public static String tags = "mtc::MTCTransformation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::MTCTransformation::Advanced::referencedResources";
			
	
		}
	
		public static class Dependencies {
	
			
			public static String fileDependencies = "mtc::MTCTransformation::Dependencies::fileDependencies";
			
			
			public static String modelDependencies = "mtc::MTCTransformation::Dependencies::modelDependencies";
			
	
		}
	
	}

	/**
	 * T2MTransformation view descriptor
	 * 
	 */
	public static class T2MTransformation {
		public static class Basic {
	
			
			public static String name = "mtc::T2MTransformation::Basic::name";
			
			
			public static String uRI = "mtc::T2MTransformation::Basic::URI";
			
			
			public static String implementationClass = "mtc::T2MTransformation::Basic::implementationClass";
			
			
			public static String description = "mtc::T2MTransformation::Basic::description";
			
			
			public static String technology = "mtc::T2MTransformation::Basic::technology";
			
			
			public static String preExecutionScript = "mtc::T2MTransformation::Basic::preExecutionScript";
			
			
			public static String postExecutionScript = "mtc::T2MTransformation::Basic::postExecutionScript";
			
	
		}
	
		public static class Libraries {
	
			
			public static String libraries_ = "mtc::T2MTransformation::Libraries::libraries_";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::T2MTransformation::Advanced::properties";
			
			
			public static String tags = "mtc::T2MTransformation::Advanced::tags";
			
			
			public static String referencedResources = "mtc::T2MTransformation::Advanced::referencedResources";
			
	
		}
	
		public static class Dependencies {
	
			
			public static String fileDependencies = "mtc::T2MTransformation::Dependencies::fileDependencies";
			
			
			public static String modelDependencies = "mtc::T2MTransformation::Dependencies::modelDependencies";
			
	
		}
	
	}

	/**
	 * InputModel view descriptor
	 * 
	 */
	public static class InputModel {
		public static class Basic {
	
			
			public static String modelAlias = "mtc::InputModel::Basic::modelAlias";
			
			
			public static String metamodelAlias = "mtc::InputModel::Basic::metamodelAlias";
			
			
			public static String index = "mtc::InputModel::Basic::index";
			
			
			public static String properties = "mtc::InputModel::Basic::properties";
			
			
			public static String model = "mtc::InputModel::Basic::model";
			
			
			public static String transformation = "mtc::InputModel::Basic::transformation";
			
	
		}
	
	}

	/**
	 * OutputModel view descriptor
	 * 
	 */
	public static class OutputModel {
		public static class Basic {
	
			
			public static String modelAlias = "mtc::OutputModel::Basic::modelAlias";
			
			
			public static String metamodelAlias = "mtc::OutputModel::Basic::metamodelAlias";
			
			
			public static String properties = "mtc::OutputModel::Basic::properties";
			
			
			public static String model = "mtc::OutputModel::Basic::model";
			
			
			public static String transformation = "mtc::OutputModel::Basic::transformation";
			
	
		}
	
	}

	/**
	 * Variable view descriptor
	 * 
	 */
	public static class Variable {
		public static class Basic {
	
			
			public static String name = "mtc::Variable::Basic::name";
			
			
			public static String type = "mtc::Variable::Basic::type";
			
			
			public static String defaultValue = "mtc::Variable::Basic::defaultValue";
			
			
			public static String description = "mtc::Variable::Basic::description";
			
	
		}
	
	}

	/**
	 * Configuration view descriptor
	 * 
	 */
	public static class Configuration {
		public static class Basic {
	
			
			public static String name = "mtc::Configuration::Basic::name";
			
			
			public static String variables = "mtc::Configuration::Basic::variables";
			
			
			public static String tags = "mtc::Configuration::Basic::tags";
			
			
			public static String libraries = "mtc::Configuration::Basic::libraries";
			
			
			public static String scripts = "mtc::Configuration::Basic::scripts";
			
			
			public static String environments = "mtc::Configuration::Basic::environments";
			
	
		}
	
	}

	/**
	 * Library view descriptor
	 * 
	 */
	public static class Library {
		public static class Basic {
	
			
			public static String name = "mtc::Library::Basic::name";
			
			
			public static String uRI = "mtc::Library::Basic::URI";
			
			
			public static String technology = "mtc::Library::Basic::technology";
			
			
			public static String description = "mtc::Library::Basic::description";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::Library::Advanced::properties";
			
			
			public static String tags = "mtc::Library::Advanced::tags";
			
			
			public static String referencedResources = "mtc::Library::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * Tag view descriptor
	 * 
	 */
	public static class Tag {
		public static class Basic {
	
			
			public static String name = "mtc::Tag::Basic::name";
			
			
			public static String description = "mtc::Tag::Basic::description";
			
	
		}
	
	}

	/**
	 * Script view descriptor
	 * 
	 */
	public static class Script {
		public static class Basic {
	
			
			public static String name = "mtc::Script::Basic::name";
			
			
			public static String uRI = "mtc::Script::Basic::URI";
			
			
			public static String implementationClass = "mtc::Script::Basic::implementationClass";
			
			
			public static String description = "mtc::Script::Basic::description";
			
			
			public static String technology = "mtc::Script::Basic::technology";
			
	
		}
	
		public static class Advanced {
	
			
			public static String properties = "mtc::Script::Advanced::properties";
			
			
			public static String tags = "mtc::Script::Advanced::tags";
			
			
			public static String referencedResources = "mtc::Script::Advanced::referencedResources";
			
	
		}
	
	}

	/**
	 * ModelEnvironment view descriptor
	 * 
	 */
	public static class ModelEnvironment {
		public static class Basic {
	
			
			public static String name = "mtc::ModelEnvironment::Basic::name";
			
			
			public static String implementationClass = "mtc::ModelEnvironment::Basic::implementationClass";
			
			
			public static String properties = "mtc::ModelEnvironment::Basic::properties";
			
	
		}
	
	}

	/**
	 * Property view descriptor
	 * 
	 */
	public static class Property {
		public static class Basic {
	
			
			public static String name = "mtc::Property::Basic::name";
			
			
			public static String value = "mtc::Property::Basic::value";
			
	
		}
	
	}

	/**
	 * ModelValidation view descriptor
	 * 
	 */
	public static class ModelValidation {
		public static class Basic {
	
			
			public static String stopOnError = "mtc::ModelValidation::Basic::stopOnError";
			
			
			public static String validation = "mtc::ModelValidation::Basic::validation";
			
			
			public static String models = "mtc::ModelValidation::Basic::models";
			
	
		}
	
	}

	/**
	 * OutputFile view descriptor
	 * 
	 */
	public static class OutputFile {
		public static class Basic {
	
			
			public static String transformation = "mtc::OutputFile::Basic::transformation";
			
			
			public static String file = "mtc::OutputFile::Basic::file";
			
	
		}
	
	}

	/**
	 * InputFile view descriptor
	 * 
	 */
	public static class InputFile {
		public static class Basic {
	
			
			public static String file = "mtc::InputFile::Basic::file";
			
			
			public static String transformation = "mtc::InputFile::Basic::transformation";
			
	
		}
	
	}

	/**
	 * Decision view descriptor
	 * 
	 */
	public static class Decision {
		public static class Basic {
	
			
			public static String name = "mtc::Decision::Basic::name";
			
			
			public static String decisionExpression = "mtc::Decision::Basic::Decision Expression";
			
			
			public static String implemenetaionClass = "mtc::Decision::Basic::implemenetaionClass";
			
			
			public static String choises = "mtc::Decision::Basic::choises";
			
	
		}
	
	}

	/**
	 * DecisionInputModel view descriptor
	 * 
	 */
	public static class DecisionInputModel {
		public static class Basic {
	
			
			public static String loadForDecisionEvaluation = "mtc::DecisionInputModel::Basic::LoadForDecisionEvaluation";
			
			
			public static String modelAlias = "mtc::DecisionInputModel::Basic::modelAlias";
			
			
			public static String metamodelAlias = "mtc::DecisionInputModel::Basic::metamodelAlias";
			
			
			public static String model = "mtc::DecisionInputModel::Basic::model";
			
			
			public static String decision = "mtc::DecisionInputModel::Basic::decision";
			
			
			public static String choisesToApply = "mtc::DecisionInputModel::Basic::choisesToApply";
			
	
		}
	
	}

	/**
	 * Choise view descriptor
	 * 
	 */
	public static class Choise {
		public static class Basic {
	
			
			public static String choiseValue = "mtc::Choise::Basic::choiseValue";
			
			
			public static String decision = "mtc::Choise::Basic::decision";
			
			
			public static String transformation = "mtc::Choise::Basic::transformation";
			
	
		}
	
	}

}
