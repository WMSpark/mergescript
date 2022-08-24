/*Copyright (c) 2019-2020 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.salesvision.salesvision.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.salesvision.salesvision.Users;

/**
 * Service object for domain model class {@link Users}.
 */
public interface UsersService {

    /**
     * Creates a new Users. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Users if any.
     *
     * @param users Details of the Users to be created; value cannot be null.
     * @return The newly created Users.
     */
    Users create(@Valid Users users);


	/**
     * Returns Users by given id if exists.
     *
     * @param usersId The id of the Users to get; value cannot be null.
     * @return Users associated with the given usersId.
	 * @throws EntityNotFoundException If no Users is found.
     */
    Users getById(Integer usersId);

    /**
     * Find and return the Users by given id if exists, returns null otherwise.
     *
     * @param usersId The id of the Users to get; value cannot be null.
     * @return Users associated with the given usersId.
     */
    Users findById(Integer usersId);

	/**
     * Find and return the list of Users by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param usersIds The id's of the Users to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Users associated with the given usersIds.
     */
    List<Users> findByMultipleIds(List<Integer> usersIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Users. It replaces all fields of the existing Users with the given users.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Users if any.
     *
     * @param users The details of the Users to be updated; value cannot be null.
     * @return The updated Users.
     * @throws EntityNotFoundException if no Users is found with given input.
     */
    Users update(@Valid Users users);


    /**
     * Partially updates the details of an existing Users. It updates only the
     * fields of the existing Users which are passed in the usersPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Users if any.
     *
     * @param usersId The id of the Users to be deleted; value cannot be null.
     * @param usersPatch The partial data of Users which is supposed to be updated; value cannot be null.
     * @return The updated Users.
     * @throws EntityNotFoundException if no Users is found with given input.
     */
    Users partialUpdate(Integer usersId, Map<String, Object> usersPatch);

    /**
     * Deletes an existing Users with the given id.
     *
     * @param usersId The id of the Users to be deleted; value cannot be null.
     * @return The deleted Users.
     * @throws EntityNotFoundException if no Users found with the given id.
     */
    Users delete(Integer usersId);

    /**
     * Deletes an existing Users with the given object.
     *
     * @param users The instance of the Users to be deleted; value cannot be null.
     */
    void delete(Users users);

    /**
     * Find all Users matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Users.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Users> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Users matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Users.
     *
     * @see Pageable
     * @see Page
     */
    Page<Users> findAll(String query, Pageable pageable);

    /**
     * Exports all Users matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Users matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Users in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Users.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}