package com.blacklinuxdude.ecom.controllers

import org.compass.core.engine.SearchEngineQueryParseException

/**
 * Basic web interface for Grails Searchable Plugin
 *
 * @author Maurice Nicholson
 */
class SearchPageController {
	def searchableService

	/**
	 * Index page with search form and results
	 */
	def index = {
		if (!params.q?.trim()) {
			params.q = "*"
		}
		try {
			return [searchResult: searchableService.search(params.q, params)]
		} catch (SearchEngineQueryParseException ex) {
			return [parseException: true]
		}
	}

	/**
	 * Perform a bulk index of every searchable object in the database
	 */
	def indexAll = {
		Thread.start {
			searchableService.index()
		}
		render("bulk index started in a background thread")
	}

	/**
	 * Perform a bulk index of every searchable object in the database
	 */
	def unindexAll = {
		searchableService.unindex()
		render("unindexAll done")
	}
}
